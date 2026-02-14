package com.example.bfhl.service;

import com.example.bfhl.enums.OperationType;
import com.example.bfhl.exception.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BfhlService {

    public Object process(String key, Object value) {

        OperationType type;

        try {
            type = OperationType.valueOf(key);
        } catch (Exception e) {
            throw new BadRequestException("Invalid key");
        }

        switch (type) {

            case fibonacci:
                return fibonacci((Integer) value);

            case prime:
                return prime((List<Integer>) value);

            case lcm:
                return lcm((List<Integer>) value);

            case hcf:
                return hcf((List<Integer>) value);

            case ai:
                return value.toString();

            default:
                throw new BadRequestException("Invalid key");
        }
    }

    private List<Integer> fibonacci(int n) {

        if (n < 0)
            throw new BadRequestException("Number must be positive");

        List<Integer> list = new ArrayList<>();

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            list.add(a);
            int temp = a + b;
            a = b;
            b = temp;
        }

        return list;
    }

    private List<Integer> prime(List<Integer> numbers) {

        List<Integer> primes = new ArrayList<>();

        for (Integer num : numbers) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }

        return primes;
    }

    private boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    private int lcm(List<Integer> numbers) {

        int result = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            result = (result * numbers.get(i)) /
                    gcd(result, numbers.get(i));
        }

        return result;
    }

    private int hcf(List<Integer> numbers) {

        int result = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            result = gcd(result, numbers.get(i));
        }

        return result;
    }

    private int gcd(int a, int b) {

        if (b == 0)
            return a;

        return gcd(b, a % b);
    }
}
