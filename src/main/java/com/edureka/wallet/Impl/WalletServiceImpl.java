package com.edureka.wallet.Impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.edureka.wallet.api.WalletService;
import com.edureka.wallet.model.PaymentTransactionDto;
import com.edureka.wallet.model.WalletDto;

@Service
public class WalletServiceImpl implements WalletService {

	private static final Logger logger = LoggerFactory.getLogger(WalletServiceImpl.class);

	@Override
	public WalletDto doTransaction(PaymentTransactionDto transaction) {
		logger.info(
			"Wallet transaction received. emailId={}, type={}, method={}, amount={}, orderId={}",
			transaction.getEmailId(),
			transaction.getType(),
			transaction.getMethod(),
			transaction.getAmount(),
			transaction.getOrderId()
		);

		// Implemented
		return null;
	}

	@Override
	public WalletDto getBalance(String emailId) {
		logger.info("Wallet balance request received. emailId={}", emailId);

		// Implemented
		return null;
	}

}
