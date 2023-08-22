package br.com.cod3r.facade.callCenter.after;

import br.com.cod3r.facade.callCenter.after.facade.CallCenterFacade;
import br.com.cod3r.facade.callCenter.after.model.Card;

public class Client {

    public static void main(String[] args) {
        CallCenterFacade facade = new CallCenterFacade();

        System.out.println();

        Card card = facade.getCardByUser(123456L);
        System.out.println(card);

        facade.getSummary(card);

        facade.getPaymentInfoByCard(card);

        facade.cancelLastRegister(card);

        Card newCard = facade.getCardByUser(123456L);
        System.out.println(newCard);
    }

}