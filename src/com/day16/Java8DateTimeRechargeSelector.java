package com.day16;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

public class Java8DateTimeRechargeSelector {
	public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        List<RechargePlan> plans = Arrays.asList(
            new RechargePlan("Jio", 149, 20, 1.0, "JioTV, Calls", today.minusDays(5)),
            new RechargePlan("Airtel", 299, 28, 1.5, "Wynk, Calls", today.minusDays(10)),
            new RechargePlan("Vi", 399, 28, 2.5, "Hotstar, Calls", today.minusDays(2)),
            new RechargePlan("BSNL", 199, 30, 2.0, "Calls only", today.minusDays(15))
        );

        Predicate<RechargePlan> highData = p -> p.dataPerDay >= 2.0;
        Predicate<RechargePlan> underBudget = p -> p.price <= 400;
        Predicate<RechargePlan> stillValid = p -> p.getRemainingDays() > 0;

        PlanChooser chooser = (planList) -> planList.stream()
            .filter(highData.and(underBudget).and(stillValid))
            .sorted(Comparator.comparingInt(p -> p.price))
            .findFirst();

        System.out.println(" Available Plans:");
        PlanChooser.printAllPlans(plans);

        Optional<RechargePlan> selected = chooser.choose(plans);
        chooser.printPlan(selected);
    }
}
