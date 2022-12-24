package nl.altindag.crip.command;

import nl.altindag.crip.command.export.ExportCommand;
import picocli.CommandLine.Command;

@Command(
        name = "crip",
        version = "crip v1.0.0",
        description = "CLI tool to extracts server certificates",
        subcommands = {
                PrintCommand.class,
                ExportCommand.class
        }
)
public class CertificateRipper {}