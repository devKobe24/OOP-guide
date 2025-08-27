package com.kobe.oopguide.encapsulation.practice.mypractice.domain;

import com.kobe.oopguide.encapsulation.practice.mypractice.repository.SummerSkillAndLevelUpInterface;

/**
 * packageName    : com.kobe.oopguide.encapsulation.practice.domain
 * fileName       : Summoner
 * author         : kobe
 * date           : 2025. 8. 25.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 8. 25.        kobe       최초 생성
 */
public class Champion implements SummerSkillAndLevelUpInterface {
	private Integer level;

	public Champion() {
		this.level = 1;
	}

	public void selectSkillUnderLevelSix(String selectSkill) {
		if (getLevel() <= 5) {
			switch (selectSkill) {
				case "Q":
				case "q":
					System.out.println("Q");
					break;
				case "W":
				case "w":
					System.out.println("W");
					break;
				case "E":
				case "e":
					System.out.println("E");
					break;
				case "R":
				case "r":
					System.out.println("6레벨 이전에는 R 스킬을 선택할 수 없습니다.");
					break;
				default:
					System.out.println("잘못된 스킬 선택입니다. Q, W, E 중에서 선택해주세요.");
					break;
			}
		}
	}

	public void selectSkillOverLevelSix(String selectSkill) {
		if (getLevel() >= 6) {
			switch (selectSkill) {
				case "Q":
				case "q":
					selectSkill = "Q";
					return;
				case "W":
				case "w":
					selectSkill = "W";
					return;
				case "E":
				case "e":
					selectSkill = "E";
					return;
				case "R":
				case "r":
					selectSkill = "R";
					return;
				default:
					System.out.println("잘못된 스킬 선택입니다. Q, W, E, R 중에서 선택해주세요.");
					break;
			}
		}
	}

	public void championLevelUp() {
		if (this.level >= 18) {
			System.out.println("최대 레벨에 도달했습니다.");
			return;
		}
		this.level++;
	}

	public Integer getLevel() {
		return this.level;
	}
}
