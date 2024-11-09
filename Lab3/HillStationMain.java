class HillStations {
    public void location() {
        System.out.println("Location: Not known");
    }

    public void famousFor() {
        System.out.println("Famous for: Not known");
    }
}

class Manali extends HillStations {
    @Override
    public void location() {
        System.out.println("Location: Manali, Himachal Pradesh");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous for: Snow-capped mountains and Adventure Sports");
    }
}

class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Location: Mussoorie, Uttarakhand");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous for: Scenic beauty and climate");
    }
}

class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Location: Gulmarg, Jammu and Kashmir");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous for: Alpather lake and Golf Course");
    }
}

public class HillStationMain {
    public static void main(String[] args) {
        HillStations hillStation = new HillStations();
        hillStation.location();
        hillStation.famousFor();

        //Making reference variable of the superclass, but objects of the subclass in the code below:

        System.out.println("\n");
        HillStations manali = new Manali();
        manali.location();
        manali.famousFor();

        System.out.println("\n");
        HillStations mussoorie = new Mussoorie();
        mussoorie.location();
        mussoorie.famousFor();

        System.out.println("\n");
        HillStations gulmarg = new Gulmarg();
        gulmarg.location();
        gulmarg.famousFor();
    }
}