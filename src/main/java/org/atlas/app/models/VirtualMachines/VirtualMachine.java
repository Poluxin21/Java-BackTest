package org.atlas.app.models.VirtualMachines;

import jakarta.persistence.*;
import org.atlas.app.models.Users.User;


@Entity
@Table(name = "VirtualMachines")
public class VirtualMachine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "MachineIp", nullable = false)
    private String MachineIp;

    @Column(name = "Port", nullable = false)
    private Integer Port;

    @Column(name = "vCpu", nullable = false)
    private Integer vCPU;;

    @Column(name = "vRam", nullable = false)
    private Integer vRam;

    @Column(name = "BandLargure", nullable = false)
    private String BandLargure;

    @ManyToOne
    private User userId;

    public VirtualMachine() {}

    public VirtualMachine(
            String machineIp,
            Integer port,
            Integer vcpu,
            Integer vram,
            String bandLargure)
    {
        this.MachineIp = machineIp;
        this.Port = port;
        this.vCPU = vcpu;
        this.vRam = vram;
        this.BandLargure = bandLargure;
    }

    public String getMachineIp()
    {
        return MachineIp;
    }

    public String setMachineIp()
    {
        return this.MachineIp = MachineIp;
    }

    public Integer getPort()
    {
        return Port;
    }

    public Integer setPort()
    {
        return this.Port = Port;
    }

    public Integer getvCPU()
    {
        return vCPU;
    }

    public Integer setvCPU()
    {
        return this.vCPU = vCPU;
    }

    public Integer getvRam()
    {
        return vRam;
    }

    public Integer setvRam()
    {
        return this.vRam = vRam;
    }

    public String getBandLargure()
    {
        return BandLargure;
    }

    public String setBandLargure()
    {
        return this.BandLargure = BandLargure;
    }

}
