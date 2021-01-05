public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = 100;
    }


    public int getVolume() {
        return this.volume;
    }


    public int drink() {
        return this.volume -= 10;
    }

    public int empty() {
        this.volume = 0;
        return this.volume;
    }

    public int fill() {
        this.volume = 100;
        return this.volume;
    }
}
