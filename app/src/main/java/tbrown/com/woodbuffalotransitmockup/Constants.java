package tbrown.com.woodbuffalotransitmockup;

/**
 * Created by tmast_000 on 6/22/2015.
 */
public class Constants {

    // Toolbar titles for activities
    public static final String TITLE_FAVOURITES = "Favourites";
    public static final String TITLE_NEARBY = "Find A Nearby Stop";
    public static final String TITLE_PLANNER = "Trip Planner";
    public static final String TITLE_ALL_ROUTES = "Find A Route";

    // IDs for navigation drawer items
    public static final int FAVOURITES = 0;
    public static final int NEARBY = 1;
    public static final int PLANNER = 2;
    public static final int ALL_ROUTES = 3;

    // Keys for favourites shared preference
    public final static String KEY_ROUTE = "Route -";
    public static final String KEY_STOP = "Stop -";

    // Transit Service IDs
    public static final String WEEKDAYS_ALL = "'15SPRI-All-Weekday-01'";
    public static final String SATURDAY = "'15SPRI-All-Saturday-01'";
    public static final String SUNDAY = "'15SPRI-All-Sunday-01'";
    public static final String[] SERVICES = {WEEKDAYS_ALL,SATURDAY,SUNDAY};

    // Google Maps Trip Planner URL
    public static final String urlGoogleTripPlanner = "https://www.google.com/maps/dir///";

}