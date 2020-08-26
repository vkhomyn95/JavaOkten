package homework5.part1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList<>();
        computers.add(new Computer(
                "LG30",
                2011,
                300,
                10000,
                new HardDrive(
                        "DD2",
                        DiskType.SSD,
                        400,
                        Country.China
                ),
                new Processor(
                        "I5",
                        8,
                        2.2,
                        Country.USA
                )
        ));
        computers.add(new Computer(
                "LG30",
                2009,
                600,
                20000,
                new HardDrive(
                        "DD2",
                        DiskType.SSD,
                        900,
                        Country.China
                ),
                new Processor(
                        "I7",
                        4,
                        2.2,
                        Country.USA
                )
        ));
        computers.add(new Computer(
                "LG30",
                2015,
                700,
                5000,
                new HardDrive(
                        "DD2",
                        DiskType.SSD,
                        200,
                        Country.China
                ),
                new Processor(
                        "I5",
                        8,
                        4.5,
                        Country.USA
                )
        ));
        computers.add(new Computer(
                "LG30",
                2007,
                100,
                10000,
                new HardDrive(
                        "DD2",
                        DiskType.SSD,
                        200,
                        Country.China
                ),
                new Processor(
                        "I5",
                        2,
                        2.2,
                        Country.India
                )
        ));
        computers.add(new Computer(
                "LG30",
                2019,
                200,
                10000,
                new HardDrive(
                        "DD2",
                        DiskType.SSD,
                        400,
                        Country.USA
                ),
                new Processor(
                        "I5",
                        8,
                        2.2,
                        Country.India
                )
        ));
        computers.add(new Computer(
                "Samsung",
                2011,
                300,
                10000,
                new HardDrive(
                        "DD2",
                        DiskType.SSD,
                        300,
                        Country.China
                ),
                new Processor(
                        "I5",
                        8,
                        2.2,
                        Country.USA
                )
        ));
        computers.add(new Computer(
                "MACBook",
                2020,
                1000,
                100000,
                new HardDrive(
                        "DD2",
                        DiskType.SSD,
                        4000,
                        Country.China
                ),
                new Processor(
                        "I9",
                        16,
                        2.2,
                        Country.USA
                )
        ));
        computers.add(new Computer(
                "Toshiba",
                2016,
                300,
                200,
                new HardDrive(
                        "DD2",
                        DiskType.SSD,
                        600,
                        Country.China
                ),
                new Processor(
                        "I5",
                        8,
                        2.2,
                        Country.USA
                )
        ));
        computers.add(new Computer(
                "Panasonic",
                2013,
                300,
                10000,
                new HardDrive(
                        "DD2",
                        DiskType.SSD,
                        400,
                        Country.China
                ),
                new Processor(
                        "I5",
                        8,
                        2.2,
                        Country.USA
                )
        ));
        computers.add(new Computer(
                "LG30",
                2006,
                300,
                10000,
                new HardDrive(
                        "DD2",
                        DiskType.SSD,
                        400,
                        Country.China
                ),
                new Processor(
                        "I5",
                        8,
                        2.2,
                        Country.USA
                )
        ));
        computers.add(new Computer(
                "LG30",
                2005,
                300,
                10000,
                new HardDrive(
                        "DD2",
                        DiskType.SSD,
                        400,
                        Country.China
                ),
                new Processor(
                        "I5",
                        8,
                        2.2,
                        Country.USA
                )
        ));
        computers.add(new Computer(
                "LG30",
                2013,
                300,
                10000,
                new HardDrive(
                        "DD2",
                        DiskType.SSD,
                        400,
                        Country.China
                ),
                new Processor(
                        "I5",
                        8,
                        2.2,
                        Country.USA
                )
        ));
        computers.add(new Computer(
                "LG30",
                2012,
                200,
                10000,
                new HardDrive(
                        "DD2",
                        DiskType.SSD,
                        400,
                        Country.China
                ),
                new Processor(
                        "I5",
                        8,
                        2.2,
                        Country.USA
                )
        ));
        computers.add(new Computer(
                "LG30",
                2019,
                300,
                10000,
                new HardDrive(
                        "DD2",
                        DiskType.SSD,
                        4000,
                        Country.China
                ),
                new Processor(
                        "I5",
                        8,
                        2.2,
                        Country.USA
                )
        ));
        computers.add(new Computer(
                "LG30",
                2011,
                100,
                10000,
                new HardDrive(
                        "DD2",
                        DiskType.SSD,
                        400,
                        Country.China
                ),
                new Processor(
                        "I5",
                        8,
                        2.2,
                        Country.USA
                )
        ));
        computers.add(new Computer(
                "LG30",
                2019,
                300,
                10000,
                new HardDrive(
                        "DD2",
                        DiskType.SSD,
                        400,
                        Country.China
                ),
                new Processor(
                        "I5",
                        8,
                        2.2,
                        Country.USA
                )
        ));
        computers.add(new Computer(
                "Maqcbook Air",
                2020,
                300,
                100000,
                new HardDrive(
                        "DD2",
                        DiskType.SSD,
                        400,
                        Country.China
                ),
                new Processor(
                        "I5",
                        8,
                        2.2,
                        Country.USA
                )
        ));
        computers.add(new Computer(
                "LG30",
                2011,
                300,
                1000,
                new HardDrive(
                        "DD2",
                        DiskType.SSD,
                        400,
                        Country.China
                ),
                new Processor(
                        "I5",
                        8,
                        2.2,
                        Country.USA
                )
        ));

//        List<Computer> dija1 = computers
//                .stream()
//                .filter(computer -> computer.getYear() > 2010)
//                .collect(Collectors.toList());
//        System.out.println(dija1);

//        List<Computer> dija2 = computers
//                .stream()
//                .filter(computer -> computer.getYear() > 2010 && computer.getHardDrive().getCountry().equals(Country.China) && computer.getProcessor().getCountry().equals(Country.China))
//                .collect(Collectors.toList());
//        System.out.println(dija2);

//        List<Computer> dija3 = computers
//                .stream()
//                .filter(computer -> computer.getYear() > 2010 && !computer.getHardDrive().getCountry().equals(Country.China) && !computer.getProcessor().getCountry().equals(Country.China))
//                .collect(Collectors.toList());
//        List<Computer> dija4 = computers
//                .stream()
//                .filter(computer -> computer.getHardDrive().getDiskValue() > 500)
//                .collect(Collectors.toList());

//        List<Computer> dija5 = computers
//                .stream()
//                .filter(computer -> computer.getHardDrive().getDiskValue() > 500 && computer.getProcessor().getType().endsWith("I7"))
//                .collect(Collectors.toList());
//        System.out.println(dija5);

        List<Computer> dija6 = computers
                .stream()
                .filter(computer -> computer.getProcessor().getType().equals("I5") && computer.getHardDrive().getDiskValue() > 500)
                .sorted((a, b) -> b.getPrice() - a.getPrice())
                .collect(Collectors.toList());
        System.out.println(dija6);
    }
}
