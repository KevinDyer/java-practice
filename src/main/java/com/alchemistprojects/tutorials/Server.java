package com.alchemistprojects.tutorials;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class Server {
    private final Random random;
    private final Map<Client, Integer> clientMap = new HashMap<>();
    private final List<Client> clientArray = new ArrayList<>();

    public Server(Random random) {
        this.random = random;
    }

    public void addClient(Client c) {
        if (!clientMap.containsKey(c)) {
            clientMap.put(c, clientArray.size());
            clientArray.add(c);
        }
    }

    public void removeClient(Client c) {
        if (clientMap.containsKey(c)) {
            int index = clientMap.remove(c);
            if (clientArray.size() > 1) {
                Client lastClient = clientArray.remove(clientArray.size() - 1);
                clientArray.set(index, lastClient);
                clientMap.put(lastClient, index);
            } else {
                clientArray.remove(1);
            }
        }
    }

    public Client getRandomClient() {
        int index = random.nextInt(clientArray.size());
        return clientArray.get(index);
    }
}
