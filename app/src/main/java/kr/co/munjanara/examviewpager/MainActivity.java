package kr.co.munjanara.examviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import kr.co.munjanara.examviewpager.models.Hero;
import kr.co.munjanara.examviewpager.models.ICharacter;
import kr.co.munjanara.examviewpager.models.Magician;
import kr.co.munjanara.examviewpager.models.Person;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.nio.channels.IllegalChannelGroupException;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.pager);
        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);

        Person person = new Person();
        Person person2 = new Person("홍길동", 20);

        System.out.println(person);
        System.out.println(person2);

        Hero hero = new Hero("슈퍼맨");
        Hero hero2 = new Hero("배트맨");
        hero.attack(hero2);

        Character character = new Hero("슈퍼맨2");
        Magician magician = new Magician();
        Character magician2 = new Magician();

        ICharacter  magician3 = new Magician();

    }

    public  void practice_main() {
        Random random =new Random();

        int rand = random.nextInt(4);

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> scoreList = new ArrayList<>();
        scoreList.add(10);
        scoreList.add(20);
        scoreList.add(30);

    }



}