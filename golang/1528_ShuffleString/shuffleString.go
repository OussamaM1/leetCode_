package shufflestring

func restoreString(s string, indices []int) string {
	ans := make([]byte, len(s))
	for i, index := range indices {
		ans[index] = s[i]
	}
	return string(ans)
}
