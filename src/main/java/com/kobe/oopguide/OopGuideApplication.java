package com.kobe.oopguide;

import com.kobe.oopguide.encapsulation.practice.aipractice.domain.Champion;
import com.kobe.oopguide.encapsulation.practice.aipractice.service.SummonerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OopGuideApplication {

	public static void main(String[] args) {
		SpringApplication.run(OopGuideApplication.class, args);

		Champion yasuo = new Champion();
		SummonerService service = new SummonerService();

		service.learnSkill(yasuo,"Q"); // 1레벨에 Q 스킬을 배웠습니다.
		service.learnSkill(yasuo,"R"); // 스킬 배우기 실패: 6레벨 미만은 R 스킬을 배울 수 없습니다.

		System.out.println("--- 5번 레벨업 ---");
		service.levelUp(yasuo);
		service.learnSkill(yasuo,"E");

		service.levelUp(yasuo);
		service.learnSkill(yasuo,"W");

		service.levelUp(yasuo);
		service.learnSkill(yasuo,"E");

		service.levelUp(yasuo);
		service.learnSkill(yasuo,"Q");

		service.levelUp(yasuo);
		service.learnSkill(yasuo, "R"); // 6레벨에 R 스킬을 배웠습니다.

		System.out.println("야스오가 배운 스킬들: " + yasuo.getLearnedSkills());
	}

}
