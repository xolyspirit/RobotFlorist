package Flowers;

import Flowers.controller.Florist;
import Flowers.view.Client;

public class Main {

    public static void main(String[] args) {
	Client client = new Client();
	Florist florist = new Florist();
	client.start(florist);
    }
}
