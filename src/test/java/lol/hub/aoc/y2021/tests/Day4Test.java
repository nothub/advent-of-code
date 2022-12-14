package lol.hub.aoc.y2021.tests;

import lol.hub.aoc.y2021.day4.GiantSquid1;
import lol.hub.aoc.y2021.day4.GiantSquid2;
import lol.hub.aoc.AssertWrapper;
import lol.hub.aoc.InputParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@DisplayName("Day 4: Giant Squid")
@Execution(ExecutionMode.CONCURRENT)
class Day4Test {

    private static final List<String> example = Collections.unmodifiableList(InputParser.stringList("inputs/2021/day4_example"));
    private static final List<String> input = Collections.unmodifiableList(InputParser.stringList("inputs/2021/day4"));

    @Test
    @DisplayName("Part 1 - Example")
    void part1_example(TestInfo info) {
        AssertWrapper.equals(4512, new GiantSquid1().solve(new ArrayList<>(example)), info);
    }

    @Test
    @DisplayName("Part 1")
    void part1(TestInfo info) {
        AssertWrapper.equals(51776, new GiantSquid1().solve(new ArrayList<>(input)), info);
    }

    @Test
    @DisplayName("Part 2 - Example")
    void part2_example(TestInfo info) {
        AssertWrapper.equals(1924, new GiantSquid2().solve(new ArrayList<>(example)), info);
    }

    @Test
    @DisplayName("Part 2")
    void part2(TestInfo info) {
        AssertWrapper.equals(16830, new GiantSquid2().solve(new ArrayList<>(input)), info);
    }

}
