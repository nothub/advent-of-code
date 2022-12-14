package lol.hub.aoc.y2021.tests;

import lol.hub.aoc.y2021.day6.Lanternfish1;
import lol.hub.aoc.y2021.day6.Lanternfish2;
import lol.hub.aoc.AssertWrapper;
import lol.hub.aoc.InputParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@DisplayName("Day 6: Lanternfish")
@Execution(ExecutionMode.CONCURRENT)
class Day6Test {

    private static final String example = InputParser.string("inputs/2021/day6_example");
    private static final String input = InputParser.string("inputs/2021/day6");

    @Test
    @DisplayName("Part 1 - Example")
    void part1_example(TestInfo info) {
        AssertWrapper.equals(5934, new Lanternfish1().solve(example), info);
    }

    @Test
    @DisplayName("Part 1")
    void part1(TestInfo info) {
        AssertWrapper.equals(379114, new Lanternfish1().solve(input), info);
    }

    @Test
    @DisplayName("Part 2 - Example")
    void part2_example(TestInfo info) {
        AssertWrapper.equals(26984457539L, new Lanternfish2().solve(example), info);
    }

    @Test
    @DisplayName("Part 2")
    void part2(TestInfo info) {
        AssertWrapper.equals(1702631502303L, new Lanternfish2().solve(input), info);
    }

}
