package com.kodilla.mockito.homework;


import java.util.*;

public class WeatherService {

    private Map<Client, Set<Localization>> list = new HashMap<>();



    public void addSubscriber(Client client, Localization localization){
        if (list.containsKey(client)){
            list.get(client).add(localization);
        }
        else {
            Set<Localization> localizations = new HashSet<>();
            localizations.add(localization);
            list.put(client,localizations);
        }
    }

    public void removeSubscriberFromLocalization(Client client, Localization localization){
       var localizations = list.get(client);
       localizations.remove(localization);
    }

    public void removeSubscriber(Client client){
        list.remove(client);
    }

    public void sendNotificationForAll(Notification notification) {
       list.keySet().forEach(client -> client.receive(notification));

    }

    public void sendNotificationForLocalization(Localization localization, Notification notification) {
        list.forEach((c,l) -> {
            if (l.contains(localization))
                c.receive(notification);
        });

    }

    public void removeLocalization(Localization localization){
        Set<Client> clientsToRemove = new HashSet<>();

        list.forEach((client, localizations) ->{
            localizations.remove(localization);
            if(localizations.size() == 0)
                clientsToRemove.add(client);
        });

        clientsToRemove.forEach(client -> {
            list.remove(client);
        });
    }



}
