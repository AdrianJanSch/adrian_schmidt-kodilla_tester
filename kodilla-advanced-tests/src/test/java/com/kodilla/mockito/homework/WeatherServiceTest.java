package com.kodilla.mockito.homework;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class WeatherServiceTest {
    Client client = Mockito.mock(Client.class);
    Localization localization = Mockito.mock(Localization.class);
    WeatherService weatherService = new WeatherService();
    Notification notification = Mockito.mock(Notification.class);
    Client client1 = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Client client3 = Mockito.mock(Client.class);

    Localization localization1 = Mockito.mock(Localization.class);
    Localization localization2 = Mockito.mock(Localization.class);


    @Test
    public void  shouldAddSubscriberToLocalizationOnlyOneAndReceiveNotification(){
        weatherService.addSubscriber(client,localization);
        weatherService.addSubscriber(client,localization);

        weatherService.sendNotificationForLocalization(localization,notification);

        Mockito.verify(client,Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldRemoveSubscriberFromLocalization(){
        weatherService.addSubscriber(client,localization);
        weatherService.removeSubscriberFromLocalization(client,localization);

        weatherService.sendNotificationForLocalization(localization,notification);

        Mockito.verify(client,Mockito.never()).receive(notification);
    }

    @Test
    public void shouldRemoveSubscriber(){
        weatherService.addSubscriber(client,localization);
        weatherService.removeSubscriber(client);
        weatherService.sendNotificationForLocalization(localization,notification);

        Mockito.verify(client,Mockito.never()).receive(notification);
    }

    @Test
    public void shouldSendNotificationToSubscribersFromLocalization(){
        weatherService.addSubscriber(client1,localization1);
        weatherService.addSubscriber(client2,localization1);
        weatherService.addSubscriber(client3,localization2);

        weatherService.sendNotificationForLocalization(localization1,notification);

        Mockito.verify(client1, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
        Mockito.verify(client3, Mockito.never()).receive(notification);

    }

    @Test
    public void shouldSendNotificationsToAllSubscribers(){
        weatherService.addSubscriber(client1,localization1);
        weatherService.addSubscriber(client2,localization1);
        weatherService.addSubscriber(client3,localization2);

        weatherService.sendNotificationForAll(notification);

        Mockito.verify(client1, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
        Mockito.verify(client3, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldRemoveLocalization(){
        weatherService.addSubscriber(client1,localization1);
        weatherService.addSubscriber(client2,localization1);
        weatherService.addSubscriber(client2,localization2);
        weatherService.addSubscriber(client3,localization2);

        weatherService.removeLocalization(localization1);

        weatherService.sendNotificationForAll(notification);

        Mockito.verify(client1, Mockito.never()).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
        Mockito.verify(client3, Mockito.times(1)).receive(notification);

    }

    @BeforeAll
    public static void IntroMessage(){
        System.out.println("Starting all tests");
    }
    @AfterAll
    public static void FinishMessage(){
        System.out.println("Finished all test");
    }

    @BeforeEach
    public void StartingTest(){
        System.out.println("Starting next test");
    }
    @AfterEach
    public void FinishedTest(){
        System.out.println("Finished test");
    }

}