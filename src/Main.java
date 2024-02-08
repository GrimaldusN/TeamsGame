import com.github.javafaker.Faker;

import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Handler handler = new Handler();
        System.out.println(generator(handler));
        generatorP(handler);
        generatorT(handler);
        System.out.println(play(handler));
    }

    public static Set<Adult> generator(Handler handler){
        Faker faker = new Faker();
        Random random = new Random();
        int rnd = random.nextInt(21, 45);
        Set<Adult> teams = new HashSet<>();
        Member member = new Member();
        while (teams.size()<=25){
            Adult adultTeam = new Adult();
            adultTeam.name = String.valueOf(faker.team());
            for (int i = 0; i < 3; i++) {
                member.name = String.valueOf(faker.name());
                member.age = rnd;
                adultTeam.members.add(i, member);
            }
            teams.add(adultTeam);
            double x = 0;
            handler.map.put(adultTeam, x);
        }return teams;
    }

    public static Set<Teenager> generatorT(Handler handler){
        Faker faker = new Faker();
        Random random = new Random();
        int rnd = random.nextInt(21, 45);
        Set<Teenager> teams = new HashSet<>();
        Member member = new Member();
        while (teams.size()<=25){
            Teenager teenagerTeam = new Teenager();
            teenagerTeam.name = String.valueOf(faker.team());
            for (int i = 0; i < 3; i++) {
                member.name = String.valueOf(faker.name());
                member.age = rnd;
                teenagerTeam.members.add(i, member);
            }
            teams.add(teenagerTeam);
            double x = 0;
            handler.map.put(teenagerTeam, x);
        }return teams;
    }

    public static Set<Pupil> generatorP(Handler handler){
        Faker faker = new Faker();
        Random random = new Random();
        int rnd = random.nextInt(21, 45);
        Set<Pupil> teams = new HashSet<>();
        Member member = new Member();
        while (teams.size()<=25){
            Pupil pupilTeam = new Pupil();
            pupilTeam.name = String.valueOf(faker.team());
            for (int i = 0; i < 3; i++) {
                member.name = String.valueOf(faker.name());
                member.age = rnd;
                pupilTeam.members.add(i, member);
            }
            teams.add(pupilTeam);
            double x = 0;
            handler.map.put(pupilTeam, x);
        }return teams;
    }

    public static Handler play(Handler handler){
        Random random = new Random();
        int rnd = random.nextInt(2);
        double x = 0;
        for (Map.Entry<Team, Double> e : handler.map.entrySet() ) {

            if (rnd == 0){
                handler.map.put(e.getKey(), x + 1);

            }
            if (rnd==1){
                handler.map.put(e.getKey(), x + 0.5);
            }
            else {
                handler.map.put(e.getKey(), x - 1);
            }
        }

        return handler;
    }
}