public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        int x = 40;
        return x;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int x){
        x = 40-x;
        return x;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int x){
        x = x*2;
        return x;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int x, int y){
        int w = preparationTimeInMinutes(x);
        return w+y;
    }
}
