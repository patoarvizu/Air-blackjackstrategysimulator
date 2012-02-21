package com.blackjackstrategysimulator;

import java.util.EnumMap;

public class BasicStrategyActions
{
    private EnumMap<HandValue, EnumMap<DealersFaceUpCard, Action>> actionMap = new EnumMap<HandValue, EnumMap<DealersFaceUpCard, Action>>(
            HandValue.class);
    
    public BasicStrategyActions()
    {
        setupActionMap();
    }

    public Action resolve(HandValue playersValue, DealersFaceUpCard dealersFaceUpCard)
    {
        return actionMap.get(playersValue).get(dealersFaceUpCard);
    }

    private void setupActionMap()
    {
        EnumMap<DealersFaceUpCard, Action> dealersFaceUpCardActionMap;
        
        dealersFaceUpCardActionMap = new EnumMap<DealersFaceUpCard, Action>(DealersFaceUpCard.class);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Two, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Three, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Four, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Five, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Six, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Seven, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Eight, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Nine, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ten, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ace, Action.Stand);
        actionMap.put(HandValue.HardTwenty, dealersFaceUpCardActionMap);
        actionMap.put(HandValue.HardNineteen, dealersFaceUpCardActionMap);
        actionMap.put(HandValue.HardEighteen, dealersFaceUpCardActionMap);
        actionMap.put(HandValue.HardSeventeen, dealersFaceUpCardActionMap);
        
        actionMap.put(HandValue.HardEleven, getDealersFaceUpCardActionMapEntry(DealersFaceUpCard.Two, Action.DoubleOrHit));
        actionMap.put(HandValue.HardTwelve, getDealersFaceUpCardActionMapEntry(DealersFaceUpCard.Two, Action.Hit));
        dealersFaceUpCardActionMap = new EnumMap<DealersFaceUpCard, Action>(DealersFaceUpCard.class);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Eight, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Nine, Action.Surrender);
        actionMap.put(HandValue.HardSixteen, dealersFaceUpCardActionMap);
        actionMap.put(HandValue.SoftAceSeven, getDealersFaceUpCardActionMapEntry(DealersFaceUpCard.Three, Action.DoubleOrStand));
        actionMap.put(HandValue.AcePair, getDealersFaceUpCardActionMapEntry(DealersFaceUpCard.Two, Action.Split));
    }

    private EnumMap<DealersFaceUpCard, Action> getDealersFaceUpCardActionMapEntry(
            DealersFaceUpCard dealersFaceUpCard, Action action)
    {
        EnumMap<DealersFaceUpCard, Action> faceUpCardActionMap = new EnumMap<DealersFaceUpCard, Action>(
                DealersFaceUpCard.class);
        faceUpCardActionMap.put(dealersFaceUpCard, action);
        return faceUpCardActionMap;
    }
}