package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderService {
    boolean order(final User user, final Product product, final LocalDateTime orderTime);
}
