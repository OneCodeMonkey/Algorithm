# AC:
# from others' solution
#
class Solution(object):
    def distinctEchoSubstrings(self, S):
        N = len(S)
        P, MOD = 37, 344555666677777  # MOD is prime
        Pinv = pow(P, MOD - 2, MOD)
        
        prefix = [0]
        pwr = 1
        ha = 0
        
        for x in map(ord, S):
            ha = (ha + pwr * x) % MOD
            pwr = pwr * P % MOD
            prefix.append(ha)
        
        seen = set()
        pwr = 1
        for length in range(1, N // 2 + 1):
            pwr = pwr * P % MOD  # pwr = P^length
            for i in range(N - 2 * length + 1):
                left = (prefix[i + length] - prefix[i]) * pwr % MOD  # hash of s[i:i+length] * P^length
                right = (prefix[i + 2 * length] - prefix[i + length]) % MOD  # hash of s[i+length:i+2*length]
                if left == right:
                    seen.add(left * pow(Pinv, i, MOD) % MOD)  # left * P^-i  is the canonical representation
        return len(seen)