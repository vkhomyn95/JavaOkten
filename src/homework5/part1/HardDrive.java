package homework5.part1;

import java.util.Objects;

public class HardDrive {
    private String hardDriveModel;
    private DiskType diskType;
    private int diskValue;
    private Country country;

    public HardDrive() {
    }

    public HardDrive(String hardDriveModel, DiskType diskType, int diskValue, Country country) {
        this.hardDriveModel = hardDriveModel;
        this.diskType = diskType;
        this.diskValue = diskValue;
        this.country = country;
    }

    public String getHardDriveModel() {
        return hardDriveModel;
    }

    public void setHardDriveModel(String hardDriveModel) {
        this.hardDriveModel = hardDriveModel;
    }

    public DiskType getDiskType() {
        return diskType;
    }

    public void setDiskType(DiskType diskType) {
        this.diskType = diskType;
    }

    public int getDiskValue() {
        return diskValue;
    }

    public void setDiskValue(int diskValue) {
        this.diskValue = diskValue;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "hardDriveModel='" + hardDriveModel + '\'' +
                ", diskType=" + diskType +
                ", diskValue=" + diskValue +
                ", country=" + country +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HardDrive hardDrive = (HardDrive) o;
        return diskValue == hardDrive.diskValue &&
                Objects.equals(hardDriveModel, hardDrive.hardDriveModel) &&
                diskType == hardDrive.diskType &&
                country == hardDrive.country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hardDriveModel, diskType, diskValue, country);
    }
}
