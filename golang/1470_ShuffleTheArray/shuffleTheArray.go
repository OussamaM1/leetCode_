package shufflethearray

func shuffle(nums []int, n int) []int {
	ans := []int{}
	for i := 0; i < n; i++ {
		ans = append(ans, nums[i])
		ans = append(ans, nums[n+i])
	}
	return ans
}
