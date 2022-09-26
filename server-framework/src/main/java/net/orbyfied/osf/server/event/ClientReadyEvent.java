package net.orbyfied.osf.server.event;

import net.orbyfied.osf.server.Server;
import net.orbyfied.osf.server.ServerClient;

public class ClientReadyEvent extends ServerClientEvent {

    public ClientReadyEvent(Server server, ServerClient client) {
        super(server, client);
    }

}
