package defanginganipaddress

import "strings"

func defangIPaddr(address string) string {
	return strings.ReplaceAll(address, ".", "[.]")
}
