public class Lamp {
    private boolean lightState;
    private String color="red";
    private int intensity;

    Lamp(){
        System.out.println("Starting construction of lamp");
        lightState=false;
        intensity=5;
    }

    Lamp(String color, int intensity){
        System.out.println("Starting construction of lamp with color"+color+"add intensity"+intensity);
        this.color=color;
        this.intensity=intensity;
    }
}

    public void turnOn(){
        System.out.println("Turning on with color"+color);
        lightState=true;
    }

    public void turnOff(){
        System.out.println("Turning off");
        lightState=false;

    }
public void
        }
}
