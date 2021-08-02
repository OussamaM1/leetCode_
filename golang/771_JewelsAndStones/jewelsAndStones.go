package jewelsandstones

func numJewelsInStones(jewels string, stones string) int {
	ans := 0
	for i := 0; i < len(jewels); i++ {
		for j := 0; j < len(stones); j++ {
			if jewels[i] == stones[j] {
				ans++
			}
		}
	}
	return ans
}
