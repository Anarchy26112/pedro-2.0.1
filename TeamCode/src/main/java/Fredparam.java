
public class Fredparam {
    // ---------  Claw params----------------
    public static final double claw_open_pos_auto = 0.62;
    public static final double claw_open_pos_teleop = 0.605;
    public static final double claw_closed_pos = 0.565;  //0.555

    //  ------------ Horizontal wrist params -----------------
    public static final double hor_wrist_wide_pos = 0.46; //orig: 0.445
    public static final double hor_wrist_thin_pos = 0.514; //orig: 0.79
    //ublic static final double hor_wrist_wide_teleop_pos = 0.1;

    // ----------- Vertical wrist params ------------
    public static final double vert_wrist_down_pos = 0.35;   // was 0.155
    public static final double vert_wrist_mid_pos = 0.395;  // was 0.41705
    public static final double vert_wrist_up_pos = 0.455; //0.76

    // -----------------Turret params ------------
    public static final int turret_basket_front_position = 2450;
    public static final int turret_basket_back_position = 3250;  // backward scoring samples
    public static final int turret_chamber_high_position = 3250; // backward scoring specimens
    public static final int turret_chamber_low_position = 1100;  // not used in backward scoring
    public static final int turret_specimen_position = 1100; //1100
    public static final int turret_floor_position = 157;   // for picking up samples for auto.
    public static final int turret_specimen_wall_position = 450;   //300
    public static final int turret_specimen_wall_macro_position = 530;
    public static  final int turret_basket_park_position = 2137;
    public static final int turret_zero_position = 0;  //use only for auto testing
    public static final int turret_min_position = 50; // limit for teleop to prevent damage
    public static final int turret_max_position = 3000; // limit for teleop to prevent damage

    // ------------------- Slide params ----------------
    public static final int slide_basket_position = 1700;
    public static final int slide_floor_position = 1284;

    // when using slides for grabbing specimen from the wall
    public static final int slide_specimen_wall_position = 840;

    public static final int slide_specimen_scoring_position = 550;

    public static final int slide_zero_position = 0;  //use only for auto testing
    public static final int slide_min_position = 50;  // limit for teleop to prevent damage
    public static final int slide_max_position = 1250; // was 1750, need to satisfy

    // ------------------- Auto Global Variables ----------------

    public static boolean is_sample;

}
