package org.iit.workshopscrum.plangarde.model;

import org.joda.time.LocalDate;

import com.sun.istack.internal.NotNull;

public class Holiday {

	@NotNull
	private LocalDate startDate;

	@NotNull
	private LocalDate endDate;

	// TODO Add validation startDate < endDate
	public Holiday(LocalDate startDate, LocalDate endDate) {
		super();
		validateDates(startDate, endDate);
		this.startDate = startDate;
		this.endDate = endDate;

	}

	private void validateDates(LocalDate startDate, LocalDate endDate) {
		if (startDate == null || endDate == null) {
			throw new IllegalArgumentException("Wrong arguments startDate/endDate");
		}
		// startDate must be strictly less than endDate
		if (startDate.isAfter(endDate)) {
			throw new IllegalArgumentException("Wrong arguments startDate/endDate");
		}

	}

	public LocalDate getStartDate() {
		return startDate;
	}

	@NotNull
	public LocalDate getEndDate() {
		return endDate;
	}

}
