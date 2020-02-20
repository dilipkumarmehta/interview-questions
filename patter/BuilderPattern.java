package dilip.desing.patter;

public class BuilderPattern {

	public static void main(String[] args) {
		Computer com = new Computer.ComputerBuilder("500", "LG").build();
		Computer com1 = new Computer.ComputerBuilder().build();
		System.out.println(com1);
	}
}

class Computer {
	private String Hard;
	private String Monitor;
	private boolean isGraphicRequired;
	private boolean isPanDriveRequired;
	private boolean isBloothoEnabled;

	private Computer(ComputerBuilder comBuilder) {

	}

	public String getHard() {
		return Hard;
	}

	public String getMonitor() {
		return Monitor;
	}

	public boolean isGraphicRequired() {
		return isGraphicRequired;
	}

	public boolean isPanDriveRequired() {
		return isPanDriveRequired;
	}

	static class ComputerBuilder {
		private String Hard;
		private String Monitor;
		private boolean isGraphicRequired;
		private boolean isPanDriveRequired;
		private boolean isBloothoEnabled;

		ComputerBuilder() {

		}

		ComputerBuilder(String Hard, String Monitor) {
			this.Hard = Hard;
			this.Monitor = Monitor;
		}

		public ComputerBuilder setHard(String hard) {
			Hard = hard;
			return this;
		}

		public ComputerBuilder setMonitor(String monitor) {
			Monitor = monitor;
			return this;
		}

		public ComputerBuilder setGraphicRequired(boolean isGraphicRequired) {
			this.isGraphicRequired = isGraphicRequired;
			return this;
		}

		public ComputerBuilder setPanDriveRequired(boolean isPanDriveRequired) {
			this.isPanDriveRequired = isPanDriveRequired;
			return this;
		}

		public ComputerBuilder setBloothoEnabled(boolean isBloothoEnabled) {
			this.isBloothoEnabled = isBloothoEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}

}
