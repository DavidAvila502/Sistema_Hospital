-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.1.16-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win32
-- HeidiSQL Versión:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
-- Volcando datos para la tabla hospital.citas: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `citas` DISABLE KEYS */;
INSERT INTO `citas` (`folio`, `paciente`, `medico`, `especialidad`, `fecha`, `hora`) VALUES
	(12, ' Emanuel', 'Manuel de Jesus Creuz Mendiola', 'Proctologo', '2021-01-10', '10:30'),
	(13, ' Oscar Arzeta', 'Jose David Avila Maldonado', 'Neuro Cirujano', '2021-01-08', '12:20'),
	(14, ' Franco Ramirez ', 'Jesus Antnonio Roman Maldonado', 'Cirujano Plastico', '2021-02-03', '6:00'),
	(15, ' Franco Ramirez ', 'Jesus Antnonio Roman Maldonado', 'Cirujano Plastico', '2021-12-03', '7:30');
/*!40000 ALTER TABLE `citas` ENABLE KEYS */;

-- Volcando datos para la tabla hospital.especialidades: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `especialidades` DISABLE KEYS */;
INSERT INTO `especialidades` (`id`, `especialidad`) VALUES
	(1, 'Cirujano'),
	(2, 'Dermatologo'),
	(3, 'Neuro Cirujano'),
	(4, 'Proctologo'),
	(5, 'Cirujano Plastico');
/*!40000 ALTER TABLE `especialidades` ENABLE KEYS */;

-- Volcando datos para la tabla hospital.medicos: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `medicos` DISABLE KEYS */;
INSERT INTO `medicos` (`id`, `nombre`, `especialidad`, `direccion`, `telefono`) VALUES
	(5, 'Jose David Avila Maldonado', 'Neuro Cirujano', 'Calle oaxaca, Col la Maquina', '7445362565'),
	(6, 'Manuel de Jesus Creuz Mendiola', 'Proctologo', 'Colosio', '745236523'),
	(7, 'Jesus Antnonio Roman Maldonado', 'Cirujano Plastico', 'Calle Oaxaca Col. La maquina', '7446794');
/*!40000 ALTER TABLE `medicos` ENABLE KEYS */;

-- Volcando datos para la tabla hospital.pacientes: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `pacientes` DISABLE KEYS */;
INSERT INTO `pacientes` (`id`, `nombre`, `direccion`, `telefono`) VALUES
	(5, ' Emanuel', '5 de mayo', '74456390'),
	(6, ' Oscar Arzeta', 'las palmas', '7445262'),
	(7, ' Franco Ramirez ', 'Fuentes no.5', '744678942');
/*!40000 ALTER TABLE `pacientes` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
