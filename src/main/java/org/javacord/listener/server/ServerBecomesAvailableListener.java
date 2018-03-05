package org.javacord.listener.server;

import org.javacord.event.server.ServerBecomesAvailableEvent;
import org.javacord.listener.GloballyAttachableListener;

/**
 * This listener listens to servers becoming unavailable.
 * Unavailability means, that a Discord server is down due to a temporary outage.
 *
 * @see <a href="https://discordapp.com/developers/docs/topics/gateway#guild-unavailability">Discord docs</a>
 */
@FunctionalInterface
public interface ServerBecomesAvailableListener extends GloballyAttachableListener {

    /**
     * This method is called every time a server became unavailable.
     *
     * @param event The event.
     */
    void onServerBecomesAvailable(ServerBecomesAvailableEvent event);
}