package po.constantinfo;

import java.io.Serializable;

public class PriceChartPO implements Serializable {
	/**
	 * 火车每公里每吨运费
	 */
	private double train_kilo_t;
	/**
	 * 货车每公里每吨运费
	 */
	private double truck_kilo_t;
	/**
	 * 飞机每公里每吨运费
	 */
	private double airplane_kilo_t;
	
	/**
	 * 标准快递标准价每公里/1000乘该值即是价格
	 */
	private double standard;
	
	/**
	 * 经济快递标准价
	 */
	private double economic;
	
	/**
	 * 次晨特快标准价
	 */
	
	private double express;

	public double getTrain_kilo_t() {
		return train_kilo_t;
	}

	public void setTrain_kilo_t(double train_kilo_t) {
		this.train_kilo_t = train_kilo_t;
	}

	public double getTruck_kilo_t() {
		return truck_kilo_t;
	}

	public void setTruck_kilo_t(double truck_kilo_t) {
		this.truck_kilo_t = truck_kilo_t;
	}

	public double getAirplane_kilo_t() {
		return airplane_kilo_t;
	}

	public void setAirplane_kilo_t(double airplane_kilo_t) {
		this.airplane_kilo_t = airplane_kilo_t;
	}

	public double getStandard() {
		return standard;
	}

	public void setStandard(double standard) {
		this.standard = standard;
	}

	public double getEconomic() {
		return economic;
	}

	public void setEconomic(double economic) {
		this.economic = economic;
	}

	public double getExpress() {
		return express;
	}

	public void setExpress(double express) {
		this.express = express;
	}
	
	public PriceChartPO(){}

	public PriceChartPO(double train_kilo_t, double truck_kilo_t,
			double airplane_kilo_t, double standard, double economic,
			double express) {
		super();
		this.train_kilo_t = train_kilo_t;
		this.truck_kilo_t = truck_kilo_t;
		this.airplane_kilo_t = airplane_kilo_t;
		this.standard = standard;
		this.economic = economic;
		this.express = express;
	}

	
}