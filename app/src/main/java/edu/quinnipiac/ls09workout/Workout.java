package edu.quinnipiac.ls09workout;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("The limb", "5 handstands"),
            new Workout("Core Time", "100 pull ups"),
            new Workout("The wimp special", "5 pull ups"),
            new Workout("Strength and Length", "500 meter run")
    };
    private Workout(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return this.name;
    }
}
