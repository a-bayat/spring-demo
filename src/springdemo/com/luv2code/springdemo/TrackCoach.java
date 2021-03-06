package springdemo.com.luv2code.springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: Inside method doMyStuffStartup");
    }

    // add a destroy method
    public void doMyStuffCleanupYoYo() {
        System.out.println("TrackCoach: Inside method doMyStuffCleanupYoYo");
    }
}
