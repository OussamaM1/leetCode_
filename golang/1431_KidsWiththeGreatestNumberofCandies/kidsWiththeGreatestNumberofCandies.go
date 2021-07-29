func kidsWithCandies(candies []int, extraCandies int) []bool {
	max := candies[0]
	for i := range candies {
		if max < candies[i] {
			max = candies[i]
		}
	}
	ans := []bool{}
	for i := range candies {
		if candies[i]+extraCandies >= max {
			ans = append(ans, true)
		} else {
			ans = append(ans, false)
		}
	}
	return ans
}