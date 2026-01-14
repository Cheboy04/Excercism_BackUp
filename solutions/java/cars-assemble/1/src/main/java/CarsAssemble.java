public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double ratePerHour = 0;
        if(speed > 0){
            if(speed <= 4){
                ratePerHour = Double.valueOf(speed) * 221;
            }
            if(speed > 4 && speed <=8){
                ratePerHour = Double.valueOf(speed) * ((90.0 / 100.0) * 221);
            }
            if(speed == 9){
                ratePerHour = Double.valueOf(speed) * ((80.0 / 100.0) * 221);
            }
            if(speed == 10){
                ratePerHour = Double.valueOf(speed) * ((77.0 / 100.0) * 221);
            }
        }
        return ratePerHour;
    }

    public int workingItemsPerMinute(int speed) {
        int ratePerMinute = 0;
        if(speed > 0){
            if(speed <= 4){
                ratePerMinute = (int) ((speed * 221)/60);
            }
            if(speed > 4 && speed <=8){
                ratePerMinute = (int) (speed * ((90.0 / 100.0) * 221)/60);
            }
            if(speed == 9){
                ratePerMinute = (int) (speed * ((80.0 / 100.0) * 221)/60);
            }
            if(speed == 10){
                ratePerMinute = (int) (speed * ((77.0 / 100.0) * 221)/60);
            }
        }
        return ratePerMinute;
    }
}
