package com.company;

public class Car{
    // Distance travelled by car on a x axis
    private float x_axis;

    // Fuel volume in litres
    private float current_fuel_volume;

    private float fuel_consumption_per_100km;

    public float getX_axis() {
        return x_axis;
    }

    public void setX_axis(float x_axis) {
        this.x_axis = x_axis;
    }

    public float getCurrent_fuel_volume() {
        return current_fuel_volume;
    }

    public void setCurrent_fuel_volume(float current_fuel_volume) {
        this.current_fuel_volume = current_fuel_volume;
    }

    public Car(float current_fuel_volume, float fuel_consumption_per_100km) {
        this.x_axis =0;
        this.current_fuel_volume = current_fuel_volume;
        this.fuel_consumption_per_100km = fuel_consumption_per_100km;
    }

    public void Refuel(float volume){
        this.current_fuel_volume += volume;
    }

    public void Travel(float kilometers){
        if(100 * (current_fuel_volume / fuel_consumption_per_100km) >= kilometers) {
            x_axis += kilometers;
            current_fuel_volume -= (kilometers / 100) * fuel_consumption_per_100km;
            System.out.println("Successfully traveled " + String.format("%.2f",kilometers) + " km.");
        }
        else {
            if(current_fuel_volume == 0)
                System.out.println("Empty tank. The car needs a refuel.");
            else {
                x_axis += 100 * (current_fuel_volume / fuel_consumption_per_100km);
                System.out.println("Could only travel " + String.format("%.2f", 100 * (current_fuel_volume / fuel_consumption_per_100km)) + " km. The car needs a refuel.");
                current_fuel_volume = 0;
            }
        }
    }

    public void Status(){
        System.out.println("Distance traveled: " + String.format("%.2f",getX_axis()) + " km.");
        System.out.println("Remaining fuel volume: " + String.format("%.2f",getCurrent_fuel_volume()) + " litres.");
    }
}
