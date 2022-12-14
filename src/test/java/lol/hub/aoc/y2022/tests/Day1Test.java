package lol.hub.aoc.y2022.tests;

import lol.hub.aoc.y2022.day1.CalorieCounting2;
import lol.hub.aoc.AssertWrapper;
import lol.hub.aoc.InputParser;
import lol.hub.aoc.y2022.day1.CalorieCounting1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.List;

@DisplayName("Day 1: Calorie Counting")
@Execution(ExecutionMode.CONCURRENT)
class Day1Test {

    private static final List<String> input = InputParser.stringList("inputs/2022/day1");

    @Test
    @DisplayName("Part 1")
    void part1(TestInfo info) {
        AssertWrapper.equals(72240, new CalorieCounting1().solve(input), info);
    }

    @Test
    @DisplayName("Part 2")
    void part2(TestInfo info) {
        AssertWrapper.equals(210957, new CalorieCounting2().solve(input), info);
    }

}
