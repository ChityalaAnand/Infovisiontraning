package com.day16;

import java.util.List;
import java.util.Optional;

public interface PlanChooser {
	Optional<RechargePlan> choose(List<RechargePlan> plans);

	default void printPlan(Optional<RechargePlan> plan) {
		plan.ifPresentOrElse(p -> System.out.println(" Selected Plan: " + p),
				() -> System.out.println(" No suitable plan found."));
	}

	static void printAllPlans(List<RechargePlan> plans) {
		plans.forEach(System.out::println);
	}
}
