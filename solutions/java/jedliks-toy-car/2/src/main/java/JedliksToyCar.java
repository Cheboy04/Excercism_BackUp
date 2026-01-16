public class JedliksToyCar {
    public int metersDriven;
    public int battPercentage; 

    public JedliksToyCar(){
        this.metersDriven = metersDriven;
        this.battPercentage = 100;
    }
    public void setMetersDriven(){
        this.metersDriven = metersDriven + 20; 
    }
    public void setBattPercentage(){
        this.battPercentage = battPercentage - 1;
    }
    public static JedliksToyCar buy() {
        JedliksToyCar newJedliksToyCar = new JedliksToyCar();
        return newJedliksToyCar;
    }

    public String distanceDisplay() {
        String distanceDisp = "Driven " + this.metersDriven + " meters";
        return distanceDisp;
    }

    public String batteryDisplay() {
        if (this.battPercentage == 0){
            String emptyBatt = "Battery empty";
            return emptyBatt;
        }
        String battDisp = "Battery at "+ this.battPercentage + "%";
        return battDisp;
    }

    public void drive() {
        if (this.battPercentage > 0){
            this.setBattPercentage();
            this.setMetersDriven();
        }
    }
}
