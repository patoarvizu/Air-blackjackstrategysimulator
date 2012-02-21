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
        actionMap.put(HandValue.SoftAceNine, dealersFaceUpCardActionMap);
        actionMap.put(HandValue.SoftAceEight, dealersFaceUpCardActionMap);
        
        dealersFaceUpCardActionMap = new EnumMap<DealersFaceUpCard, Action>(DealersFaceUpCard.class);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Two, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Three, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Four, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Five, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Six, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Seven, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Eight, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Nine, Action.Surrender);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ten, Action.Surrender);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ace, Action.Surrender);
        actionMap.put(HandValue.HardSixteen, dealersFaceUpCardActionMap);
        
        dealersFaceUpCardActionMap = new EnumMap<DealersFaceUpCard, Action>(DealersFaceUpCard.class);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Two, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Three, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Four, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Five, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Six, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Seven, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Eight, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Nine, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ten, Action.Surrender);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ace, Action.Hit);
        actionMap.put(HandValue.HardFifteen, dealersFaceUpCardActionMap);
        
        dealersFaceUpCardActionMap = new EnumMap<DealersFaceUpCard, Action>(DealersFaceUpCard.class);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Two, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Three, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Four, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Five, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Six, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Seven, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Eight, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Nine, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ten, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ace, Action.Hit);
        actionMap.put(HandValue.HardFourteen, dealersFaceUpCardActionMap);
        actionMap.put(HandValue.HardThirteen, dealersFaceUpCardActionMap);
        
        dealersFaceUpCardActionMap = new EnumMap<DealersFaceUpCard, Action>(DealersFaceUpCard.class);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Two, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Three, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Four, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Five, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Six, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Seven, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Eight, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Nine, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ten, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ace, Action.Hit);
        actionMap.put(HandValue.HardTwelve, dealersFaceUpCardActionMap);
        
        dealersFaceUpCardActionMap = new EnumMap<DealersFaceUpCard, Action>(DealersFaceUpCard.class);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Two, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Three, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Four, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Five, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Six, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Seven, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Eight, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Nine, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ten, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ace, Action.Hit);
        actionMap.put(HandValue.HardEleven, dealersFaceUpCardActionMap);
        
        dealersFaceUpCardActionMap = new EnumMap<DealersFaceUpCard, Action>(DealersFaceUpCard.class);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Two, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Three, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Four, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Five, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Six, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Seven, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Eight, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Nine, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ten, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ace, Action.Hit);
        actionMap.put(HandValue.HardTen, dealersFaceUpCardActionMap);
        
        dealersFaceUpCardActionMap = new EnumMap<DealersFaceUpCard, Action>(DealersFaceUpCard.class);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Two, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Three, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Four, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Five, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Six, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Seven, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Eight, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Nine, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ten, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ace, Action.Hit);
        actionMap.put(HandValue.HardNine, dealersFaceUpCardActionMap);
        
        dealersFaceUpCardActionMap = new EnumMap<DealersFaceUpCard, Action>(DealersFaceUpCard.class);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Two, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Three, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Four, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Five, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Six, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Seven, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Eight, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Nine, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ten, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ace, Action.Hit);
        actionMap.put(HandValue.HardEight, dealersFaceUpCardActionMap);
        actionMap.put(HandValue.HardSeven, dealersFaceUpCardActionMap);
        actionMap.put(HandValue.HardSix, dealersFaceUpCardActionMap);
        actionMap.put(HandValue.HardFive, dealersFaceUpCardActionMap);
        
        dealersFaceUpCardActionMap = new EnumMap<DealersFaceUpCard, Action>(DealersFaceUpCard.class);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Two, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Three, Action.DoubleOrStand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Four, Action.DoubleOrStand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Five, Action.DoubleOrStand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Six, Action.DoubleOrStand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Seven, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Eight, Action.Stand);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Nine, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ten, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ace, Action.Hit);
        actionMap.put(HandValue.SoftAceSeven, dealersFaceUpCardActionMap);
        
        dealersFaceUpCardActionMap = new EnumMap<DealersFaceUpCard, Action>(DealersFaceUpCard.class);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Two, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Three, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Four, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Five, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Six, Action.DoubleOrHit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Seven, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Eight, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Nine, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ten, Action.Hit);
        dealersFaceUpCardActionMap.put(DealersFaceUpCard.Ace, Action.Hit);
        actionMap.put(HandValue.SoftAceSix, dealersFaceUpCardActionMap);
        
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