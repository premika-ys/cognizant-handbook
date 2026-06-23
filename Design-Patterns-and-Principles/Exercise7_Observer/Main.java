package Exercise7_Observer;



import java.util.ArrayList;
import java.util.List;

public class Main {

    interface Observer {
        void update(String message);
    }

    static class Subscriber implements Observer {

        private String name;

        public Subscriber(String name) {
            this.name = name;
        }

        public void update(String message) {
            System.out.println(name + " received notification: " + message);
        }
    }

    static class YouTubeChannel {

        private List<Observer> subscribers = new ArrayList<>();

        public void subscribe(Observer observer) {
            subscribers.add(observer);
        }

        public void notifySubscribers(String message) {

            for (Observer observer : subscribers) {
                observer.update(message);
            }
        }
    }

    public static void main(String[] args) {

        YouTubeChannel channel = new YouTubeChannel();

        Subscriber sub1 = new Subscriber("Premika");
        Subscriber sub2 = new Subscriber("Minho");

        channel.subscribe(sub1);
        channel.subscribe(sub2);

        channel.notifySubscribers("New Java Tutorial Uploaded!");
    }
}
