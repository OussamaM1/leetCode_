package countitemsmatchingarule

func countMatches(items [][]string, ruleKey string, ruleValue string) int {
	ans := 0
	rule := map[string]int{"type": 0, "color": 1, "name": 2}[ruleKey]
	for _, item := range items {
		if item[rule] == ruleValue {
			ans++
		}
	}
	return ans
}
