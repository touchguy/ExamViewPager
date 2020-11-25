package kr.co.munjanara.examviewpager;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import kr.co.munjanara.examviewpager.models.Hero;
import kr.co.munjanara.examviewpager.models.Magician;
import kr.co.munjanara.examviewpager.models.Person;

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

//        Character character = new Hero("슈퍼맨2");
        Magician magician = new Magician();
//        Character magician2 = new Magician();

        Toast.makeText(this, "프로그램 수정", Toast.LENGTH_SHORT).show();

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