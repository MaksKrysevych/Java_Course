package advanced.practice6.observer.git;

import java.util.ArrayList;
import java.util.List;

public interface WebHook {
    String branch();
    Event.Type type();
    List<Event> caughtEvents();
    void onEvent(Event event);
}

class WebHookImplementation implements WebHook {
    Event.Type type;
    List<Event> events;
    String branch;

    public WebHookImplementation(String branch, Event.Type type) {
        this.events = new ArrayList<>();
        this.branch = branch;
        this.type = type;
    }

    @Override
    public String branch() {
        return branch;
    }

    @Override
    public Event.Type type() {
        return type;
    }

    @Override
    public List<Event> caughtEvents() {
        return events;
    }

    @Override
    public void onEvent(Event event) {
        this.type = event.type();
        events.add(event);
    }
}
