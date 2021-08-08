package richestcustomerwealth

func maximumWealth(accounts [][]int) int {
	ans := 0
	for i := 0; i < len(accounts); i++ {
		sum := 0
		for j := 0; j < len(accounts[i]); j++ {
			sum += accounts[i][j]
		}
		if sum > ans {
			ans = sum
		}
	}

	return ans
}
