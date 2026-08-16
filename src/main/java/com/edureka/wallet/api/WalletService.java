package com.edureka.wallet.api;

import com.edureka.wallet.model.PaymentTransactionDto;
import com.edureka.wallet.model.WalletDto;

/**
 * Defines the common contract for wallet operations.
 *
 * All wallet implementations must follow this interface.
 */
public interface WalletService {

    /**
     * Processes a wallet transaction such as a credit or debit.
     *
     * @param transaction transaction details
     * @return updated wallet information
     */
    WalletDto doTransaction(PaymentTransactionDto transaction);

    /**
     * Retrieves the wallet balance for a user.
     *
     * @param emailId user's email address
     * @return wallet balance information
     */
    WalletDto getBalance(String emailId);
}