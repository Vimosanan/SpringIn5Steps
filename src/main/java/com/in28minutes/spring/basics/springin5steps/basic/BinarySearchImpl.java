package com.in28minutes.spring.basics.springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired(required = false)
	private SortAlgorithm sortAlgorithm;

	// public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
	// super();
	// this.sortAlgorithm = sortAlgorithm;
	// }

	public int binarySearch(int[] numbers, int searchedNumber) {
		// BubbleSortAlgorithm bubbleSortAlgo = new BubbleSortAlgorithm();
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// Searching algorithm
		return 3;

	}

	// @PostConstruct
	// public void postConstruct() {
	// logger.info("Post Construct");
	// }

	// @PreDestroy
	// public void preDestroy() {
	// logger.info("Pre Destroy - alert");
	// }
}
