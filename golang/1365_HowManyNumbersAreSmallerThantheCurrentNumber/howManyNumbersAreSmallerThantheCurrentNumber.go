package howmanynumbersaresmallerthanthecurrentnumber

func smallerNumbersThanCurrent(nums []int) []int {
	ans := []int{}
	for i := 0; i < len(nums); i++ {
		count := 0
		for j := 0; j < len(nums); j++ {
			if nums[i] > nums[j] {
				count++
			}
		}
		ans = append(ans, count)
	}
	return ans
}
